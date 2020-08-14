package me.andrewq.coffeeshop.menu_items;



// Commented section from previously using the JPA but now opting for just JDBC
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// @Entity
public class Menu {

    
    // @Id //Identifies this as the primary key
    // @GeneratedValue(strategy=GenerationType.AUTO)
    private int productId;

    private String name;

    private double price;

    private String[][] productOptions;

    private String type;


    public Menu(int productId, String name, double price, String productOptions, String type){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.productOptions = convertOptions(productOptions);
        this.type = type;
    }

    private String[][] convertOptions(String options) {
        String[] optionPairs = options.split(",");

        //hard coded b/c I know that these are pairs 
        String retVal[][] = new String[optionPairs.length][2];

        for(int i = 0; i < optionPairs.length; ++i){
            String[] temp = optionPairs[i].split(":");
            retVal[i] =  temp;
        }

        return retVal;
    }


    public int getProductId() {
        return this.productId;
    }

    // @JsonSetter("product id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String[][] getProductOptions() {
        return this.productOptions;
    }

    public void setProductOptions(String[][] productOptions) {
        this.productOptions = productOptions;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    


}