package com.iesemilidarder.asoto;

/**
 * com.iesemilidarder.asoto
 * Class SystemUtilHelper
 * By berto. 08/10/2018
 */
public class SystemUtilHelper {

    private SystemUtilHelper() {
        //Todo: OS generalization
    }

    public static void consolePrint(String message) {
        System.out.println(message);
    }


    public static void logError(Exception e) {
        consolePrint("ERROR:" + e);
    }


}
