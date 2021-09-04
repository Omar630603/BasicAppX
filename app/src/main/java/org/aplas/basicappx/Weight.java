package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight() {
        this.gram = 0;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }
    public void setOunce(double ounce) {
        this.gram = ounce*28.3495231;
    }
    public void setPound(double pound) {
        this.gram = pound*453.59237;
    }
    public double getGram() {
        return this.gram;
    }
    public double getOunce() {
        return this.gram/28.3495231;
    }
    public double getPound(){
        return this.gram/453.59237;
    }
    public double convert(String oriUnit, String convUnit, double value){
        //Gram
        if(oriUnit.equalsIgnoreCase("Grm") && convUnit.equalsIgnoreCase("Grm")){
            return value;
        }
        if(oriUnit.equalsIgnoreCase("Grm") && convUnit.equalsIgnoreCase("Onc")){
            setGram(value);
            return this.getOunce();
        }
        if(oriUnit.equalsIgnoreCase("Grm") && convUnit.equalsIgnoreCase("Pnd")){
            setGram(value);
            return this.getPound();
        }
        //Ounce
        if(oriUnit.equalsIgnoreCase("Onc") && convUnit.equalsIgnoreCase("Grm")){
            setOunce(value);
            return this.getGram();
        }
        if(oriUnit.equalsIgnoreCase("Onc") && convUnit.equalsIgnoreCase("Onc")){
            return value;
        }
        if(oriUnit.equalsIgnoreCase("Onc") && convUnit.equalsIgnoreCase("Pnd")){
            setOunce(value);
            return this.getPound();
        }
        //Pound
        if(oriUnit.equalsIgnoreCase("Pnd") && convUnit.equalsIgnoreCase("Grm")){
            setPound(value);
            return this.getGram();
        }
        if(oriUnit.equalsIgnoreCase("Pnd") && convUnit.equalsIgnoreCase("Onc")){
            setPound(value);
            return this.getOunce();
        }
        if(oriUnit.equalsIgnoreCase("Pnd") && convUnit.equalsIgnoreCase("Pnd")){
            return value;
        }
        return 0;
    }
}
