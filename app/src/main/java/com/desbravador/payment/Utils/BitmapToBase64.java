package com.desbravador.payment.Utils;

import android.graphics.Bitmap;
import android.util.Base64;

import java.io.ByteArrayOutputStream;

public class BitmapToBase64 {
    public static String bitmapToBase64(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream); // You can use other formats too, like JPEG

        byte[] byteArray = byteArrayOutputStream.toByteArray();

        // Encode the byte array into a Base64 string

        return Base64.encodeToString(byteArray, Base64.DEFAULT);
    }
}
