public class Geometriss {
    private String color = "white";
    private boolean filled;
    
    public Geometriss(){
    }
    
    public Geometriss(String color, boolean filled){
            this.color = color;
            this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        return "warna: " + color + " and terisi: " + filled;
    }
}
