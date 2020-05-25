package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {

    @Column(nullable = false)
    private String id;

    @Id
    private String name;

    @Column(nullable = false)
    private double fat;

    @Column(nullable = false)
    private double calorie;

    @Column(nullable = false)
    private double carbohydrate;

    @Column(nullable = false)
    private double protein;

    public String getName() {
        return this.name;
    }

    public double roundResult(double calculatedValue){
        double roundOff = Math.round(calculatedValue*100)/100;
        return roundOff;
    }

    public double calculateFat(double gramm)
    {
        double calculatedFat=roundResult(gramm/100)*this.fat;
        return calculatedFat;
    };

    public double calculateCarbohydrate(double gramm)
    {
        double calculatedCarbohydrate=roundResult(gramm/100)*this.carbohydrate;
        return calculatedCarbohydrate;
    };

    public double calculateCalorie(double gramm)
    {
        double calculatedCalorie=roundResult(gramm/100)*this.calorie;
        return calculatedCalorie;
    };

    public double calculateProtein(double gramm)
    {
        double calculatedProtein=roundResult(gramm/100)*this.protein;
        return calculatedProtein;
    };
}
