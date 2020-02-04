package com.example.android_u2_tema2_micliente;

import android.app.Application;

import io.socket.client.IO;
import io.socket.client.Socket;

public class App extends Application {
  private static Socket mSocket;
  @Override
  public void onCreate() {
    super.onCreate();
//Se crea un socket que apunta a la ruta que se muestra
    try {
      //se cambia por nuestra ruta
      mSocket = IO.socket("http://jhotaxiupt.eu-4.evennode.com/");
      //mSocket = IO.socket("http://wiluptchat.eu-4.evennode.com/");
    }
    catch (Exception e){
    }
  }

  //RETORNA LA SOLICITUD
  public static Socket getSocket() {
    return mSocket;
  }
}
