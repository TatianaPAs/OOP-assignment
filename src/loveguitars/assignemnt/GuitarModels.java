/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveguitars.assignemnt;

/**
 *
 * @author Tatiana
 */
public class GuitarModels {
    protected String model;
    protected Build builder;
    protected GuitarType type;
    protected Wood backWood;
    protected Wood topWood;

    public GuitarModels(String model, Build builder, GuitarType type, Wood backWood, Wood topWood) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getModel() {
        return model;
    }

    public Build getBuilder() {
        return builder;
    }

    public GuitarType getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

}
