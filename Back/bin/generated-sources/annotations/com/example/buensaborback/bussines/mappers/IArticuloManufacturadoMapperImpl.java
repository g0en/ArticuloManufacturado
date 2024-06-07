package com.example.buensaborback.bussines.mappers;

import com.example.buensaborback.domain.dtos.ImagenDto;
import com.example.buensaborback.domain.dtos.articulos.manufacturado.ArticuloManufacturadoDetalleDto;
import com.example.buensaborback.domain.dtos.articulos.manufacturado.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.dtos.categoria.CategoriaDto;
import com.example.buensaborback.domain.dtos.promocion.PromocionDetalleDto;
import com.example.buensaborback.domain.dtos.unidadmedida.UnidadMedidaDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import com.example.buensaborback.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaborback.domain.entities.Categoria;
import com.example.buensaborback.domain.entities.Imagen;
import com.example.buensaborback.domain.entities.PromocionDetalle;
import com.example.buensaborback.domain.entities.UnidadMedida;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T12:39:14-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class IArticuloManufacturadoMapperImpl implements IArticuloManufacturadoMapper {

    @Autowired
    private IPromocionDetalleMapper iPromocionDetalleMapper;
    @Autowired
    private IArticuloInsumoMapper iArticuloInsumoMapper;

    @Override
    public ArticuloManufacturadoDto toDTO(ArticuloManufacturado source) {
        if ( source == null ) {
            return null;
        }

        ArticuloManufacturadoDto.ArticuloManufacturadoDtoBuilder<?, ?> articuloManufacturadoDto = ArticuloManufacturadoDto.builder();

        articuloManufacturadoDto.alta( source.isAlta() );
        articuloManufacturadoDto.id( source.getId() );
        articuloManufacturadoDto.categoria( categoriaToCategoriaDto( source.getCategoria() ) );
        articuloManufacturadoDto.denominacion( source.getDenominacion() );
        articuloManufacturadoDto.imagenes( imagenSetToImagenDtoSet( source.getImagenes() ) );
        articuloManufacturadoDto.precioVenta( source.getPrecioVenta() );
        articuloManufacturadoDto.promocionDetalle( promocionDetalleSetToPromocionDetalleDtoSet( source.getPromocionDetalle() ) );
        articuloManufacturadoDto.unidadMedida( unidadMedidaToUnidadMedidaDto( source.getUnidadMedida() ) );
        articuloManufacturadoDto.articuloManufacturadoDetalles( articuloManufacturadoDetalleSetToArticuloManufacturadoDetalleDtoSet( source.getArticuloManufacturadoDetalles() ) );
        articuloManufacturadoDto.descripcion( source.getDescripcion() );
        articuloManufacturadoDto.preparacion( source.getPreparacion() );
        articuloManufacturadoDto.tiempoEstimadoMinutos( source.getTiempoEstimadoMinutos() );

        return articuloManufacturadoDto.build();
    }

    @Override
    public ArticuloManufacturado toEntity(ArticuloManufacturadoDto source) {
        if ( source == null ) {
            return null;
        }

        ArticuloManufacturado.ArticuloManufacturadoBuilder<?, ?> articuloManufacturado = ArticuloManufacturado.builder();

        if ( source.getAlta() != null ) {
            articuloManufacturado.alta( source.getAlta() );
        }
        articuloManufacturado.id( source.getId() );
        articuloManufacturado.categoria( categoriaDtoToCategoria( source.getCategoria() ) );
        articuloManufacturado.denominacion( source.getDenominacion() );
        articuloManufacturado.imagenes( imagenDtoSetToImagenSet( source.getImagenes() ) );
        articuloManufacturado.precioVenta( source.getPrecioVenta() );
        articuloManufacturado.promocionDetalle( promocionDetalleDtoSetToPromocionDetalleSet( source.getPromocionDetalle() ) );
        articuloManufacturado.unidadMedida( unidadMedidaDtoToUnidadMedida( source.getUnidadMedida() ) );
        articuloManufacturado.articuloManufacturadoDetalles( articuloManufacturadoDetalleDtoSetToArticuloManufacturadoDetalleSet( source.getArticuloManufacturadoDetalles() ) );
        articuloManufacturado.descripcion( source.getDescripcion() );
        articuloManufacturado.preparacion( source.getPreparacion() );
        articuloManufacturado.tiempoEstimadoMinutos( source.getTiempoEstimadoMinutos() );

        return articuloManufacturado.build();
    }

    @Override
    public List<ArticuloManufacturadoDto> toDTOsList(List<ArticuloManufacturado> source) {
        if ( source == null ) {
            return null;
        }

        List<ArticuloManufacturadoDto> list = new ArrayList<ArticuloManufacturadoDto>( source.size() );
        for ( ArticuloManufacturado articuloManufacturado : source ) {
            list.add( toDTO( articuloManufacturado ) );
        }

        return list;
    }

    @Override
    public List<ArticuloManufacturado> toEntitiesList(List<ArticuloManufacturadoDto> source) {
        if ( source == null ) {
            return null;
        }

        List<ArticuloManufacturado> list = new ArrayList<ArticuloManufacturado>( source.size() );
        for ( ArticuloManufacturadoDto articuloManufacturadoDto : source ) {
            list.add( toEntity( articuloManufacturadoDto ) );
        }

        return list;
    }

    protected CategoriaDto categoriaToCategoriaDto(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaDto.CategoriaDtoBuilder<?, ?> categoriaDto = CategoriaDto.builder();

        categoriaDto.alta( categoria.isAlta() );
        categoriaDto.id( categoria.getId() );
        categoriaDto.denominacion( categoria.getDenominacion() );

        return categoriaDto.build();
    }

    protected ImagenDto imagenToImagenDto(Imagen imagen) {
        if ( imagen == null ) {
            return null;
        }

        ImagenDto.ImagenDtoBuilder<?, ?> imagenDto = ImagenDto.builder();

        imagenDto.alta( imagen.isAlta() );
        imagenDto.id( imagen.getId() );
        imagenDto.url( imagen.getUrl() );

        return imagenDto.build();
    }

    protected Set<ImagenDto> imagenSetToImagenDtoSet(Set<Imagen> set) {
        if ( set == null ) {
            return null;
        }

        Set<ImagenDto> set1 = new LinkedHashSet<ImagenDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Imagen imagen : set ) {
            set1.add( imagenToImagenDto( imagen ) );
        }

        return set1;
    }

    protected Set<PromocionDetalleDto> promocionDetalleSetToPromocionDetalleDtoSet(Set<PromocionDetalle> set) {
        if ( set == null ) {
            return null;
        }

        Set<PromocionDetalleDto> set1 = new LinkedHashSet<PromocionDetalleDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PromocionDetalle promocionDetalle : set ) {
            set1.add( iPromocionDetalleMapper.toDTO( promocionDetalle ) );
        }

        return set1;
    }

    protected UnidadMedidaDto unidadMedidaToUnidadMedidaDto(UnidadMedida unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        UnidadMedidaDto.UnidadMedidaDtoBuilder<?, ?> unidadMedidaDto = UnidadMedidaDto.builder();

        unidadMedidaDto.alta( unidadMedida.isAlta() );
        unidadMedidaDto.id( unidadMedida.getId() );
        unidadMedidaDto.denominacion( unidadMedida.getDenominacion() );

        return unidadMedidaDto.build();
    }

    protected ArticuloManufacturadoDetalleDto articuloManufacturadoDetalleToArticuloManufacturadoDetalleDto(ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        if ( articuloManufacturadoDetalle == null ) {
            return null;
        }

        ArticuloManufacturadoDetalleDto.ArticuloManufacturadoDetalleDtoBuilder<?, ?> articuloManufacturadoDetalleDto = ArticuloManufacturadoDetalleDto.builder();

        articuloManufacturadoDetalleDto.alta( articuloManufacturadoDetalle.isAlta() );
        articuloManufacturadoDetalleDto.id( articuloManufacturadoDetalle.getId() );
        articuloManufacturadoDetalleDto.articuloInsumo( iArticuloInsumoMapper.toDTO( articuloManufacturadoDetalle.getArticuloInsumo() ) );
        articuloManufacturadoDetalleDto.cantidad( articuloManufacturadoDetalle.getCantidad() );

        return articuloManufacturadoDetalleDto.build();
    }

    protected Set<ArticuloManufacturadoDetalleDto> articuloManufacturadoDetalleSetToArticuloManufacturadoDetalleDtoSet(Set<ArticuloManufacturadoDetalle> set) {
        if ( set == null ) {
            return null;
        }

        Set<ArticuloManufacturadoDetalleDto> set1 = new LinkedHashSet<ArticuloManufacturadoDetalleDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ArticuloManufacturadoDetalle articuloManufacturadoDetalle : set ) {
            set1.add( articuloManufacturadoDetalleToArticuloManufacturadoDetalleDto( articuloManufacturadoDetalle ) );
        }

        return set1;
    }

    protected Categoria categoriaDtoToCategoria(CategoriaDto categoriaDto) {
        if ( categoriaDto == null ) {
            return null;
        }

        Categoria.CategoriaBuilder<?, ?> categoria = Categoria.builder();

        if ( categoriaDto.getAlta() != null ) {
            categoria.alta( categoriaDto.getAlta() );
        }
        categoria.id( categoriaDto.getId() );
        categoria.denominacion( categoriaDto.getDenominacion() );

        return categoria.build();
    }

    protected Imagen imagenDtoToImagen(ImagenDto imagenDto) {
        if ( imagenDto == null ) {
            return null;
        }

        Imagen.ImagenBuilder<?, ?> imagen = Imagen.builder();

        if ( imagenDto.getAlta() != null ) {
            imagen.alta( imagenDto.getAlta() );
        }
        imagen.id( imagenDto.getId() );
        imagen.url( imagenDto.getUrl() );

        return imagen.build();
    }

    protected Set<Imagen> imagenDtoSetToImagenSet(Set<ImagenDto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Imagen> set1 = new LinkedHashSet<Imagen>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ImagenDto imagenDto : set ) {
            set1.add( imagenDtoToImagen( imagenDto ) );
        }

        return set1;
    }

    protected Set<PromocionDetalle> promocionDetalleDtoSetToPromocionDetalleSet(Set<PromocionDetalleDto> set) {
        if ( set == null ) {
            return null;
        }

        Set<PromocionDetalle> set1 = new LinkedHashSet<PromocionDetalle>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PromocionDetalleDto promocionDetalleDto : set ) {
            set1.add( iPromocionDetalleMapper.toEntity( promocionDetalleDto ) );
        }

        return set1;
    }

    protected UnidadMedida unidadMedidaDtoToUnidadMedida(UnidadMedidaDto unidadMedidaDto) {
        if ( unidadMedidaDto == null ) {
            return null;
        }

        UnidadMedida.UnidadMedidaBuilder<?, ?> unidadMedida = UnidadMedida.builder();

        if ( unidadMedidaDto.getAlta() != null ) {
            unidadMedida.alta( unidadMedidaDto.getAlta() );
        }
        unidadMedida.id( unidadMedidaDto.getId() );
        unidadMedida.denominacion( unidadMedidaDto.getDenominacion() );

        return unidadMedida.build();
    }

    protected ArticuloManufacturadoDetalle articuloManufacturadoDetalleDtoToArticuloManufacturadoDetalle(ArticuloManufacturadoDetalleDto articuloManufacturadoDetalleDto) {
        if ( articuloManufacturadoDetalleDto == null ) {
            return null;
        }

        ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleBuilder<?, ?> articuloManufacturadoDetalle = ArticuloManufacturadoDetalle.builder();

        if ( articuloManufacturadoDetalleDto.getAlta() != null ) {
            articuloManufacturadoDetalle.alta( articuloManufacturadoDetalleDto.getAlta() );
        }
        articuloManufacturadoDetalle.id( articuloManufacturadoDetalleDto.getId() );
        articuloManufacturadoDetalle.articuloInsumo( iArticuloInsumoMapper.toEntity( articuloManufacturadoDetalleDto.getArticuloInsumo() ) );
        articuloManufacturadoDetalle.cantidad( articuloManufacturadoDetalleDto.getCantidad() );

        return articuloManufacturadoDetalle.build();
    }

    protected Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalleDtoSetToArticuloManufacturadoDetalleSet(Set<ArticuloManufacturadoDetalleDto> set) {
        if ( set == null ) {
            return null;
        }

        Set<ArticuloManufacturadoDetalle> set1 = new LinkedHashSet<ArticuloManufacturadoDetalle>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ArticuloManufacturadoDetalleDto articuloManufacturadoDetalleDto : set ) {
            set1.add( articuloManufacturadoDetalleDtoToArticuloManufacturadoDetalle( articuloManufacturadoDetalleDto ) );
        }

        return set1;
    }
}
