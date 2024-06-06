import React, { useState, useEffect } from 'react';
import { Form, Button, Alert } from 'react-bootstrap';
import { createSucursal, updateSucursal } from '../services/SucursalService';
import { SucursalFull } from '../entities/DTO/Sucursal/SucursalFull';



interface AddSucursalFormProps {
  onAddSucursal: () => void;
  sucursalEditando: SucursalFull | null;
  idEmpresa: number | undefined;
}

const SucursalForm: React.FC<AddSucursalFormProps> = ({ onAddSucursal, sucursalEditando , idEmpresa}) => {
  const [sucursal, setSucursal] = useState<SucursalFull>(() => sucursalEditando? sucursalEditando : new SucursalFull(idEmpresa))
  const [error, setError] = useState<string | null>(null);
  const [success, setSuccess] = useState<boolean>(false);

  useEffect(() => {
    if (sucursalEditando) {
      setSucursal(sucursalEditando);
    }
  }, [sucursalEditando]);

  const handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = event.target;
    setSucursal({ ...sucursal, [name]: value });
  };

  const handleSubmit = async (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    try {
      if (sucursalEditando) {
        await updateSucursal(sucursalEditando.id, sucursal);
      } else {
        await createSucursal(sucursal);
      }
      setSuccess(true);
      setSucursal(new SucursalFull(idEmpresa)); // Reinicializa el estado de sucursal con el ID de empresa
      setError(null);
      onAddSucursal();
    } catch (err) {
      setError('Error al crear o actualizar la sucursal');
      setSuccess(false);
    }
  };

  return (
    <div>
      <h2>{sucursalEditando ? 'Editar Sucursal' : 'Agregar Sucursal'}</h2>
      <Form onSubmit={handleSubmit}>
        <Form.Group controlId="nombre">
          <Form.Label>Nombre</Form.Label>
          <Form.Control
            type="text"
            name="nombre"
            value={sucursal.nombre}
            onChange={handleChange}
            required
          />
        </Form.Group>
        <Form.Group controlId="horarioApertura">
          <Form.Label>Horario Apertura</Form.Label>
          <Form.Control
            type="text"
            name="horarioApertura"
            value={sucursal.horarioApertura}
            onChange={handleChange}
            required
          />
        </Form.Group>
        <Form.Group controlId="horarioCierre">
          <Form.Label>Horario Cierre</Form.Label>
          <Form.Control
            type="text"
            name="horarioCierre"
            value={sucursal.horarioCierre}
            onChange={handleChange}
            required
          />
        </Form.Group>
        <Button variant="primary" type="submit">
          {sucursalEditando ? 'Actualizar' : 'Agregar'}
        </Button>
      </Form>
      {success && <Alert variant="success">{sucursalEditando ? 'Sucursal actualizada con éxito' : 'Sucursal creada con éxito'}</Alert>}
      {error && <Alert variant="danger">{error}</Alert>}
    </div>
  );
};

export default SucursalForm;
