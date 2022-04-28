package com.company;

public class UserLogin {

    public static void main(String[] args) {
	    private final Database db;

        UserLogin(Database db){
            this.db = db;
        }

        void login(String userName, String pass){
            User user = db.findUserByUsername();
            if(User == null){

            }
            else{

            }
        }

      //  void sendMail(User user, String message){} Viola el primer principio ya que no tiene nada que ver con logear usuario.

public class EmailSender{
            void sendEmail(User user, String message){

            }
}
    }
    //Principios de SOLID
    //1- Principio de responsabilidad unica: Se refiere a la responsabilida unica que deberia tener cada programa con una manera unica y acotada.
    //2- Principio Abierto / Cerrado: Todas las clases, modulos, metodos, interfaces, etc... Deberia estar abierto para extenderse pero deberia estar cerrado para modificarse.
    //3- Principio de sustitucion (liskov): Si una clase a es un subtipo de la clase b deberiamos poder reemplazar la b con a sin afectar el comportamiento de nuestro programa.
    //4- Principio de agregacion de interfaces: No debe estar la clase obligada a depender de los metodos que no se utilizan.
    //5- Principio de inversion de dependencias: No debe existir dependencias entre los modulos, en especial entre los modulos de bajo nivel y alto nivel.

}
