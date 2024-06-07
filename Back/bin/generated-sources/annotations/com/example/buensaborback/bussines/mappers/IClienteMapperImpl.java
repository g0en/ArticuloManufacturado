package com.example.buensaborback.bussines.mappers;

import com.example.buensaborback.domain.dtos.cliente.ClienteFullDto;
import com.example.buensaborback.domain.dtos.domicilio.DomicilioFullDto;
import com.example.buensaborback.domain.entities.Cliente;
import com.example.buensaborback.domain.entities.Domicilio;
import com.example.buensaborback.domain.entities.Imagen;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T12:39:13-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class IClienteMapperImpl implements IClienteMapper {

    @Autowired
    private IDomicilioMapper iDomicilioMapper;

    @Override
    public ClienteFullDto toDTO(Cliente source) {
        if ( source == null ) {
            return null;
        }

        ClienteFullDto.ClienteFullDtoBuilder<?, ?> clienteFullDto = ClienteFullDto.builder();

        clienteFullDto.imagen( sourceImagenUrl( source ) );
        clienteFullDto.alta( source.isAlta() );
        clienteFullDto.id( source.getId() );
        clienteFullDto.apellido( source.getApellido() );
        clienteFullDto.domicilios( domicilioSetToDomicilioFullDtoList( source.getDomicilios() ) );
        clienteFullDto.email( source.getEmail() );
        clienteFullDto.fechaNacimiento( source.getFechaNacimiento() );
        clienteFullDto.nombre( source.getNombre() );
        clienteFullDto.telefono( source.getTelefono() );

        return clienteFullDto.build();
    }

    @Override
    public Cliente toEntity(ClienteFullDto source) {
        if ( source == null ) {
            return null;
        }

        Cliente.ClienteBuilder<?, ?> cliente = Cliente.builder();

        cliente.imagen( clienteFullDtoToImagen( source ) );
        if ( source.getAlta() != null ) {
            cliente.alta( source.getAlta() );
        }
        cliente.id( source.getId() );
        cliente.apellido( source.getApellido() );
        cliente.domicilios( domicilioFullDtoListToDomicilioSet( source.getDomicilios() ) );
        cliente.email( source.getEmail() );
        cliente.fechaNacimiento( source.getFechaNacimiento() );
        cliente.nombre( source.getNombre() );
        cliente.telefono( source.getTelefono() );

        return cliente.build();
    }

    @Override
    public List<ClienteFullDto> toDTOsList(List<Cliente> source) {
        if ( source == null ) {
            return null;
        }

        List<ClienteFullDto> list = new ArrayList<ClienteFullDto>( source.size() );
        for ( Cliente cliente : source ) {
            list.add( toDTO( cliente ) );
        }

        return list;
    }

    @Override
    public List<Cliente> toEntitiesList(List<ClienteFullDto> source) {
        if ( source == null ) {
            return null;
        }

        List<Cliente> list = new ArrayList<Cliente>( source.size() );
        for ( ClienteFullDto clienteFullDto : source ) {
            list.add( toEntity( clienteFullDto ) );
        }

        return list;
    }

    private String sourceImagenUrl(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }
        Imagen imagen = cliente.getImagen();
        if ( imagen == null ) {
            return null;
        }
        String url = imagen.getUrl();
        if ( url == null ) {
            return null;
        }
        return url;
    }

    protected List<DomicilioFullDto> domicilioSetToDomicilioFullDtoList(Set<Domicilio> set) {
        if ( set == null ) {
            return null;
        }

        List<DomicilioFullDto> list = new ArrayList<DomicilioFullDto>( set.size() );
        for ( Domicilio domicilio : set ) {
            list.add( iDomicilioMapper.toDTO( domicilio ) );
        }

        return list;
    }

    protected Imagen clienteFullDtoToImagen(ClienteFullDto clienteFullDto) {
        if ( clienteFullDto == null ) {
            return null;
        }

        Imagen.ImagenBuilder<?, ?> imagen = Imagen.builder();

        imagen.url( clienteFullDto.getImagen() );

        return imagen.build();
    }

    protected Set<Domicilio> domicilioFullDtoListToDomicilioSet(List<DomicilioFullDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Domicilio> set = new LinkedHashSet<Domicilio>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( DomicilioFullDto domicilioFullDto : list ) {
            set.add( iDomicilioMapper.toEntity( domicilioFullDto ) );
        }

        return set;
    }
}
