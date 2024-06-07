package com.example.buensaborback.bussines.mappers;

import com.example.buensaborback.domain.dtos.empresa.EmpresaDto;
import com.example.buensaborback.domain.entities.Empresa;
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
public class IEmpresaMapperImpl implements IEmpresaMapper {

    @Override
    public EmpresaDto toDTO(Empresa source) {
        if ( source == null ) {
            return null;
        }

        EmpresaDto.EmpresaDtoBuilder<?, ?> empresaDto = EmpresaDto.builder();

        empresaDto.alta( source.isAlta() );
        empresaDto.id( source.getId() );
        empresaDto.cuil( source.getCuil() );
        empresaDto.nombre( source.getNombre() );
        empresaDto.razonSocial( source.getRazonSocial() );

        return empresaDto.build();
    }

    @Override
    public Empresa toEntity(EmpresaDto source) {
        if ( source == null ) {
            return null;
        }

        Empresa.EmpresaBuilder<?, ?> empresa = Empresa.builder();

        if ( source.getAlta() != null ) {
            empresa.alta( source.getAlta() );
        }
        empresa.id( source.getId() );
        empresa.cuil( source.getCuil() );
        empresa.nombre( source.getNombre() );
        empresa.razonSocial( source.getRazonSocial() );

        return empresa.build();
    }

    @Override
    public List<EmpresaDto> toDTOsList(List<Empresa> source) {
        if ( source == null ) {
            return null;
        }

        List<EmpresaDto> list = new ArrayList<EmpresaDto>( source.size() );
        for ( Empresa empresa : source ) {
            list.add( toDTO( empresa ) );
        }

        return list;
    }

    @Override
    public List<Empresa> toEntitiesList(List<EmpresaDto> source) {
        if ( source == null ) {
            return null;
        }

        List<Empresa> list = new ArrayList<Empresa>( source.size() );
        for ( EmpresaDto empresaDto : source ) {
            list.add( toEntity( empresaDto ) );
        }

        return list;
    }
}
