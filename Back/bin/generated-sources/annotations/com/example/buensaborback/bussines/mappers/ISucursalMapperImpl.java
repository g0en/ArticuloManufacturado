package com.example.buensaborback.bussines.mappers;

import com.example.buensaborback.domain.dtos.empresa.EmpresaDto;
import com.example.buensaborback.domain.dtos.sucursal.SucursalDto;
import com.example.buensaborback.domain.entities.Empresa;
import com.example.buensaborback.domain.entities.Sucursal;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T12:39:14-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ISucursalMapperImpl implements ISucursalMapper {

    @Override
    public SucursalDto toDTO(Sucursal source) {
        if ( source == null ) {
            return null;
        }

        SucursalDto.SucursalDtoBuilder<?, ?> sucursalDto = SucursalDto.builder();

        sucursalDto.alta( source.isAlta() );
        sucursalDto.id( source.getId() );
        sucursalDto.empresa( empresaToEmpresaDto( source.getEmpresa() ) );
        if ( source.getHorarioApertura() != null ) {
            sucursalDto.horarioApertura( DateTimeFormatter.ISO_LOCAL_TIME.format( source.getHorarioApertura() ) );
        }
        if ( source.getHorarioCierre() != null ) {
            sucursalDto.horarioCierre( DateTimeFormatter.ISO_LOCAL_TIME.format( source.getHorarioCierre() ) );
        }
        sucursalDto.nombre( source.getNombre() );

        return sucursalDto.build();
    }

    @Override
    public Sucursal toEntity(SucursalDto source) {
        if ( source == null ) {
            return null;
        }

        Sucursal.SucursalBuilder<?, ?> sucursal = Sucursal.builder();

        if ( source.getAlta() != null ) {
            sucursal.alta( source.getAlta() );
        }
        sucursal.id( source.getId() );
        sucursal.empresa( empresaDtoToEmpresa( source.getEmpresa() ) );
        if ( source.getHorarioApertura() != null ) {
            sucursal.horarioApertura( LocalTime.parse( source.getHorarioApertura() ) );
        }
        if ( source.getHorarioCierre() != null ) {
            sucursal.horarioCierre( LocalTime.parse( source.getHorarioCierre() ) );
        }
        sucursal.nombre( source.getNombre() );

        return sucursal.build();
    }

    @Override
    public List<SucursalDto> toDTOsList(List<Sucursal> source) {
        if ( source == null ) {
            return null;
        }

        List<SucursalDto> list = new ArrayList<SucursalDto>( source.size() );
        for ( Sucursal sucursal : source ) {
            list.add( toDTO( sucursal ) );
        }

        return list;
    }

    @Override
    public List<Sucursal> toEntitiesList(List<SucursalDto> source) {
        if ( source == null ) {
            return null;
        }

        List<Sucursal> list = new ArrayList<Sucursal>( source.size() );
        for ( SucursalDto sucursalDto : source ) {
            list.add( toEntity( sucursalDto ) );
        }

        return list;
    }

    protected EmpresaDto empresaToEmpresaDto(Empresa empresa) {
        if ( empresa == null ) {
            return null;
        }

        EmpresaDto.EmpresaDtoBuilder<?, ?> empresaDto = EmpresaDto.builder();

        empresaDto.alta( empresa.isAlta() );
        empresaDto.id( empresa.getId() );
        empresaDto.cuil( empresa.getCuil() );
        empresaDto.nombre( empresa.getNombre() );
        empresaDto.razonSocial( empresa.getRazonSocial() );

        return empresaDto.build();
    }

    protected Empresa empresaDtoToEmpresa(EmpresaDto empresaDto) {
        if ( empresaDto == null ) {
            return null;
        }

        Empresa.EmpresaBuilder<?, ?> empresa = Empresa.builder();

        if ( empresaDto.getAlta() != null ) {
            empresa.alta( empresaDto.getAlta() );
        }
        empresa.id( empresaDto.getId() );
        empresa.cuil( empresaDto.getCuil() );
        empresa.nombre( empresaDto.getNombre() );
        empresa.razonSocial( empresaDto.getRazonSocial() );

        return empresa.build();
    }
}
