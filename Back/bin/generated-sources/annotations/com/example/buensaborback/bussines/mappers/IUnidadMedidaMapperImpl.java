package com.example.buensaborback.bussines.mappers;

import com.example.buensaborback.domain.dtos.unidadmedida.UnidadMedidaDto;
import com.example.buensaborback.domain.entities.UnidadMedida;
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
public class IUnidadMedidaMapperImpl implements IUnidadMedidaMapper {

    @Override
    public UnidadMedidaDto toDTO(UnidadMedida source) {
        if ( source == null ) {
            return null;
        }

        UnidadMedidaDto.UnidadMedidaDtoBuilder<?, ?> unidadMedidaDto = UnidadMedidaDto.builder();

        unidadMedidaDto.alta( source.isAlta() );
        unidadMedidaDto.id( source.getId() );
        unidadMedidaDto.denominacion( source.getDenominacion() );

        return unidadMedidaDto.build();
    }

    @Override
    public UnidadMedida toEntity(UnidadMedidaDto source) {
        if ( source == null ) {
            return null;
        }

        UnidadMedida.UnidadMedidaBuilder<?, ?> unidadMedida = UnidadMedida.builder();

        if ( source.getAlta() != null ) {
            unidadMedida.alta( source.getAlta() );
        }
        unidadMedida.id( source.getId() );
        unidadMedida.denominacion( source.getDenominacion() );

        return unidadMedida.build();
    }

    @Override
    public List<UnidadMedidaDto> toDTOsList(List<UnidadMedida> source) {
        if ( source == null ) {
            return null;
        }

        List<UnidadMedidaDto> list = new ArrayList<UnidadMedidaDto>( source.size() );
        for ( UnidadMedida unidadMedida : source ) {
            list.add( toDTO( unidadMedida ) );
        }

        return list;
    }

    @Override
    public List<UnidadMedida> toEntitiesList(List<UnidadMedidaDto> source) {
        if ( source == null ) {
            return null;
        }

        List<UnidadMedida> list = new ArrayList<UnidadMedida>( source.size() );
        for ( UnidadMedidaDto unidadMedidaDto : source ) {
            list.add( toEntity( unidadMedidaDto ) );
        }

        return list;
    }
}
