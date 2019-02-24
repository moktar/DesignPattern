package com.example.designpattern.creationalpattern.factorypattern;

public class GetPlaneFactory {
    //use getPlan method to get object of type Plan
    public Plane getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLANE")) {
            return new DomesticPlane();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLANE")){
            return new CommercialPlane();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLANE")) {
            return new InstitutionalPlane();
        }
        return null;
    }
}
