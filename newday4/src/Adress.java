public class Adress {
    private String street;
    private  String city;
    private int pincode;

    //set street
    public void setdata(String street ,String city,int pincode) {
        this.street = street;
        this.city = city;
        this.pincode=pincode;
    }
    //get street
    public String getstreet() {
        return street;
    }





    //get city
    public String getcity()
    {
        return city;
    }



    //get pincode
    public int getPincode(){
        return pincode;
    }
}
