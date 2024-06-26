package com.example.buensaborback.bussines.mappers;

import com.example.buensaborback.domain.dtos.domicilio.DomicilioFullDto;
import com.example.buensaborback.domain.entities.Domicilio;
import com.example.buensaborback.domain.entities.Localidad;
import com.example.buensaborback.domain.entities.Pais;
import com.example.buensaborback.domain.entities.Provincia;
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
public class IDomicilioMapperImpl implements IDomicilioMapper {

    @Override
    public DomicilioFullDto toDTO(Domicilio source) {
        if ( source == null ) {
            return null;
        }

        DomicilioFullDto.DomicilioFullDtoBuilder<?, ?> domicilioFullDto = DomicilioFullDto.builder();

        domicilioFullDto.localidad( sourceLocalidadNombre( source ) );
        domicilioFullDto.provincia( sourceLocalidadProvinciaNombre( source ) );
        domicilioFullDto.pais( sourceLocalidadProvinciaPaisNombre( source ) );
        domicilioFullDto.alta( source.isAlta() );
        domicilioFullDto.id( source.getId() );
        domicilioFullDto.calle( source.getCalle() );
        domicilioFullDto.cp( source.getCp() );
        domicilioFullDto.numero( source.getNumero() );

        return domicilioFullDto.build();
    }

    @Override
    public Domicilio toEntity(DomicilioFullDto source) {
        if ( source == null ) {
            return null;
        }

        Domicilio.DomicilioBuilder<?, ?> domicilio = Domicilio.builder();

        domicilio.localidad( domicilioFullDtoToLocalidad( source ) );
        if ( source.getAlta() != null ) {
            domicilio.alta( source.getAlta() );
        }
        domicilio.id( source.getId() );
        domicilio.calle( source.getCalle() );
        domicilio.cp( source.getCp() );
        domicilio.numero( source.getNumero() );

        return domicilio.build();
    }

    @Override
    public List<DomicilioFullDto> toDTOsList(List<Domicilio> source) {
        if ( source == null ) {
            return null;
        }

        List<DomicilioFullDto> list = new ArrayList<DomicilioFullDto>( source.size() );
        for ( Domicilio domicilio : source ) {
            list.add( toDTO( domicilio ) );
        }

        return list;
    }

    @Override
    public List<Domicilio> toEntitiesList(List<DomicilioFullDto> source) {
        if ( source == null ) {
            return null;
        }

        List<Domicilio> list = new ArrayList<Domicilio>( source.size() );
        for ( DomicilioFullDto domicilioFullDto : source ) {
            list.add( toEntity( domicilioFullDto ) );
        }

        return list;
    }

    private String sourceLocalidadNombre(Domicilio domicilio) {
        if ( domicilio == null ) {
            return null;
        }
        Localidad localidad = domicilio.getLocalidad();
        if ( localidad == null ) {
            return null;
        }
        String nombre = localidad.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }

    private String sourceLocalidadProvinciaNombre(Domicilio domicilio) {
        if ( domicilio == null ) {
            return null;
        }
        Localidad localidad = domicilio.getLocalidad();
        if ( localidad == null ) {
            return null;
        }
        Provincia provincia = localidad.getProvincia();
        if ( provincia == null ) {
            return null;
        }
        String nombre = provincia.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }

    private String sourceLocalidadProvinciaPaisNombre(Domicilio domicilio) {
        if ( domicilio == null ) {
            return null;
        }
        Localidad localidad = domicilio.getLocalidad();
        if ( localidad == null ) {
            return null;
        }
        Provincia provincia = localidad.getProvincia();
        if ( provincia == null ) {
            return null;
        }
        Pais pais = provincia.getPais();
        if ( pais == null ) {
            return null;
        }
        String nombre = pais.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }

    protected Pais domicilioFullDtoToPais(DomicilioFullDto domicilioFullDto) {
        if ( domicilioFullDto == null ) {
            return null;
        }

        Pais.PaisBuilder<?, ?> pais = Pais.builder();

        pais.nombre( domicilioFullDto.getPais() );

        return pais.build();
    }

    protected Provincia domicilioFullDtoToProvincia(DomicilioFullDto domicilioFullDto) {
        if ( domicilioFullDto == null ) {
            return null;
        }

        Provincia.ProvinciaBuilder<?, ?> provincia = Provincia.builder();

        provincia.pais( domicilioFullDtoToPais( domicilioFullDto ) );
        provincia.nombre( domicilioFullDto.getProvincia() );

        return provincia.build();
    }

    protected Localidad domicilioFullDtoToLocalidad(DomicilioFullDto domicilioFullDto) {
        if ( domicilioFullDto == null ) {
            return null;
        }

        Localidad.LocalidadBuilder<?, ?> localidad = Localidad.builder();

        localidad.provincia( domicilioFullDtoToProvincia( domicilioFullDto ) );
        localidad.nombre( domicilioFullDto.getLocalidad() );

        return localidad.build();
    }
}
