import React from 'react';
import { Card, Nav } from 'react-bootstrap';
import { Link } from 'react-router-dom';
import './Sidebar.css'; // Asegúrate de importar el archivo CSS

const Sidebar: React.FC = () => {
    return (
        <div className="sidebar d-flex flex-column vh-100">
            <div className="sidebar-header">
                <Card.Img variant="top" src={"https://cdn.pixabay.com/photo/2017/06/13/22/31/logo-2400338_1280.png"} />
            </div>
            <Nav className="flex-column">
                <Nav.Link as={Link} to="/productos" className="sidebar-link">Productos</Nav.Link>
                <Nav.Link as={Link} to="/create-product/0" className="sidebar-link">Crear Productos</Nav.Link>
                <Nav.Link as={Link} to="/ingredientes" className="sidebar-link">Ingredientes</Nav.Link>
            </Nav>
        </div>
    );
};

export default Sidebar;
