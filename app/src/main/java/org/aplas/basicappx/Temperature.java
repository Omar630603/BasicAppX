package org.aplas.basicappx;

public class Temperature {
    private double celcius;

    public Temperature() {
        this.celcius = 0;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }
    public void setFahrenheit(double f) {
        this.celcius = (f-32)*5/9;
    }
    public void setKelvins(double k) {
        this.celcius = k-273.15;
    }
    public double getCelcius() {
        return celcius;
    }
    public double getFahrenheit() {
        return (this.celcius*1.8)+32;
    }
    public double getKelvins(){
        return this.celcius+273.15;
    }
    public double convert(String oriUnit, String convUnit, double value){
        //Celcius
        if(oriUnit.equalsIgnoreCase("°C") && convUnit.equalsIgnoreCase("°C")){
            return value;
        }
        if(oriUnit.equalsIgnoreCase("°C") && convUnit.equalsIgnoreCase("°F")){
            setCelcius(value);
            return this.getFahrenheit();
        }
        if(oriUnit.equalsIgnoreCase("°C") && convUnit.equalsIgnoreCase("K")){
            setCelcius(value);
            return this.getKelvins();
        }
        //Fahrenheit
        if(oriUnit.equalsIgnoreCase("°F") && convUnit.equalsIgnoreCase("°C")){
            setFahrenheit(value);
            return this.getCelcius();
        }
        if(oriUnit.equalsIgnoreCase("°F") && convUnit.equalsIgnoreCase("°F")){
            return value;
        }
        if(oriUnit.equalsIgnoreCase("°F") && convUnit.equalsIgnoreCase("K")){
            setFahrenheit(value);
            return this.getKelvins();
        }
        //Kelvins
        if(oriUnit.equalsIgnoreCase("K") && convUnit.equalsIgnoreCase("°C")){
            setKelvins(value);
            return this.getCelcius();
        }
        if(oriUnit.equalsIgnoreCase("K") && convUnit.equalsIgnoreCase("°F")){
            setKelvins(value);
            return this.getFahrenheit();
        }
        if(oriUnit.equalsIgnoreCase("K") && convUnit.equalsIgnoreCase("K")){
            return value;
        }
        return 0;
    }
}
