package com.example.buensaborback.bussines.mappers;

import com.example.buensaborback.domain.dtos.categoria.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
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
public class ICategoriaMapperImpl implements ICategoriaMapper {

    @Override
    public CategoriaDto toDTO(Categoria source) {
        if ( source == null ) {
            return null;
        }

        CategoriaDto.CategoriaDtoBuilder<?, ?> categoriaDto = CategoriaDto.builder();

        categoriaDto.alta( source.isAlta() );
        categoriaDto.id( source.getId() );
        categoriaDto.denominacion( source.getDenominacion() );

        return categoriaDto.build();
    }

    @Override
    public Categoria toEntity(CategoriaDto source) {
        if ( source == null ) {
            return null;
        }

        Categoria.CategoriaBuilder<?, ?> categoria = Categoria.builder();

        if ( source.getAlta() != null ) {
            categoria.alta( source.getAlta() );
        }
        categoria.id( source.getId() );
        categoria.denominacion( source.getDenominacion() );

        return categoria.build();
    }

    @Override
    public List<CategoriaDto> toDTOsList(List<Categoria> source) {
        if ( source == null ) {
            return null;
        }

        List<CategoriaDto> list = new ArrayList<CategoriaDto>( source.size() );
        for ( Categoria categoria : source ) {
            list.add( toDTO( categoria ) );
        }

        return list;
    }

    @Override
    public List<Categoria> toEntitiesList(List<CategoriaDto> source) {
        if ( source == null ) {
            return null;
        }

        List<Categoria> list = new ArrayList<Categoria>( source.size() );
        for ( CategoriaDto categoriaDto : source ) {
            list.add( toEntity( categoriaDto ) );
        }

        return list;
    }
}
