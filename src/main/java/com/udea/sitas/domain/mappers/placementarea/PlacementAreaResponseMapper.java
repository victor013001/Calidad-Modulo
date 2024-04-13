package com.udea.sitas.domain.mappers.placementarea;

import com.udea.sitas.domain.entities.PlacementAreaEntity;
import com.udea.sitas.domain.models.placementArea.PlacementAreaResponse;

// This class maps the placement area entity to the placement area response
public class PlacementAreaResponseMapper {

    private PlacementAreaEntity placementAreaEntity;

    private PlacementAreaResponseMapper(){

    }

    public static PlacementAreaResponseMapper builder(){
        return new PlacementAreaResponseMapper();
    }

    public PlacementAreaResponseMapper withPlacementAreaEntity(PlacementAreaEntity placementAreaEntity){
        this.placementAreaEntity = placementAreaEntity;
        return this;
    }

    public PlacementAreaResponse mapToResponse(){
        return PlacementAreaResponse.builder()
                .id(placementAreaEntity.getId())
                .name(placementAreaEntity.getName())
                .build();
    }
    
}
