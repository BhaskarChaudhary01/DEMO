public class studentclass {
    private int standard;
    private char section ;
    public studentclass(){
    }
    public void setStandard(int standard){
        this.standard=standard;
    }
    public int getStandard(){
        return standard;
    }
    public void setSection(char section){
        this.section=section;
    }
    public char getSection(){
        return section;
    }
    public String toString(){
    return ("Standrad =>"+this.standard+" section=>"+this.section);
    }
}
