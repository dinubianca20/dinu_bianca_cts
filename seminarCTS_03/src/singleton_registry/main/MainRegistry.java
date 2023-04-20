package singleton_registry.main;

import singleton_registry.model.DomeniuInternet;

import java.util.Map;

public class MainRegistry {
    public static void main(String[] args) {

        DomeniuInternet domeniuInternet1 = DomeniuInternet.getDomeniu("seminar4.ro");
        DomeniuInternet domeniuInternet2 = DomeniuInternet.getDomeniu("seminar5.ro");
        DomeniuInternet domeniuInternet3 = DomeniuInternet.getDomeniu("seminar5.ro");

        domeniuInternet1.setAnInregistrare(2021);
        domeniuInternet2.setAnInregistrare(2019);
        domeniuInternet3.setAnInregistrare(2020);

        Map<String,DomeniuInternet> map=DomeniuInternet.getDomeniiInternet();

        for(Map.Entry<String,DomeniuInternet> entry: map.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        System.out.println(domeniuInternet1.toString());
        System.out.println(domeniuInternet2.toString());
        System.out.println(domeniuInternet3.toString());
    }
}
