/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;

/**
 *
 * @author Administrator
 */
public class Results implements java.io.Serializable
{
    private String add,sub,mul,div;

    public Results() {
    }

    public Results(String add, String sub, String mul, String div) {
        this.add = add;
        this.sub = sub;
        this.mul = mul;
        this.div = div;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getMul() {
        return mul;
    }

    public void setMul(String mul) {
        this.mul = mul;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }
    
}
