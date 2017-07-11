package kh.edu.app.myproject.lc_luncher.DB;

/**
 * Created by Mork Pin on 5/23/2017.
 */

public class HomeText
{

    private String imgFood;
    private String txtFood;
    private String imgBlack;
    private String txtPrice;

    public HomeText(String imgFood, String txtFood, String imgBlack, String txtPrice) {
        this.imgFood = imgFood;
        this.txtFood = txtFood;
        this.imgBlack = imgBlack;
        this.txtPrice = txtPrice;
    }

    public String getImgFood() {
        return imgFood;
    }

    public String getTxtFood() {
        return txtFood;
    }

    public String getImgBlack() {
        return imgBlack;
    }

    public String getTxtPrice() {
        return txtPrice;
    }
}
