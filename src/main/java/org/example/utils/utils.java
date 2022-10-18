package org.example.utils;

import jdk.jshell.execution.Util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class utils {

    static NumberFormat formatoNumeros = new DecimalFormat("R$#,##0,00");
    static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");


    public static String doubletoString(Double valor) {
        return formatoNumeros.format(valor);
    }

}


