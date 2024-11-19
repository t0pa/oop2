package org.example.week6.midtermprep.task1;

public class Dish extends MenuItem {

    private CuisineType cuisineType;
    private String mainIngredient;

    public Dish(String code,String name,CuisineType cuisineType,String mainIngredient){
        this.setCode(code);
        this.setName(name);
        this.cuisineType=cuisineType;
        this.mainIngredient=mainIngredient;
    }

    @Override
    public String getDescription() {
        return cuisineType +" " +mainIngredient;
     }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }
}
