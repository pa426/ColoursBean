/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloursbean;

import java.awt.Image;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author Alexandru
 */
public class ColoursBeanBeanInfo extends SimpleBeanInfo {

    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor x = new PropertyDescriptor("scrRed", ColoursBean.class, "getRedSliderValue", "setRedSliderValue");
            PropertyDescriptor y = new PropertyDescriptor("scrGreen", ColoursBean.class, "getGreenSliderValue", "setGreenSliderValue");
            PropertyDescriptor z = new PropertyDescriptor("scrBlue", ColoursBean.class, "getBlueSliderValue", "setBlueSliderValue");
            PropertyDescriptor a = new PropertyDescriptor("redLbl", ColoursBean.class, "getRedLabelValue", "setRedLabelValue");
            PropertyDescriptor s = new PropertyDescriptor("greenLbl", ColoursBean.class, "getGreenLabelValue", "setGreenLabelValue");
            PropertyDescriptor d = new PropertyDescriptor("blueLbl", ColoursBean.class, "getBlueLabelValue", "setBlueLabelValue");
            PropertyDescriptor f = new PropertyDescriptor("setLabelBySlider", ColoursBean.class, "setLabelBySlider", "getColour");
            PropertyDescriptor g = new PropertyDescriptor("colLbl", ColoursBean.class, "getColLabelValue", "setColLabelValue");
            PropertyDescriptor[] xyz = new PropertyDescriptor[]{
                x, y, z, a, s, d, f, g};
            return xyz;

        } catch (IntrospectionException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Image getIcon(int iconKind) {
        switch (iconKind) {
            case java.beans.BeanInfo.ICON_COLOR_16x16:
                return loadImage("sk16.png");
            case java.beans.BeanInfo.ICON_COLOR_32x32:
                return loadImage("sk32.png");
            case java.beans.BeanInfo.ICON_MONO_16x16:
                return loadImage("sk16.png");
            case java.beans.BeanInfo.ICON_MONO_32x32:
                return loadImage("sk32.png");
        }
        return null;
    }
}
