package ca.mobileappsolutions.stewardmedicine;

/**
 * Created by Nick on 2016-07-08.
 */

public class NavDrawerItem {

    private String title;

    public NavDrawerItem(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
