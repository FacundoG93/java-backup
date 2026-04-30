package ar.edu.unlam.pb1.tp2.parteA;

public class Ejercicio7 {
    public static void main (String [] args){
        String prohibido = "Israel";
        int letrasJ = prohibido.length();
        String archivos = "Islamic State threat is alive at Israel's doorstep despite terror group's losses elsewhere\n" +
                "Christian Zionist leader Matt Hagee hopes millennials 'will be as pro-Israel as we are'\n" +
                "Asthma treatment could be Israel's latest high achievement in medical cannabis\n" +
                "There's no good reason for anti-US, anti-Israel UN voting patterns\n" +
                "\n" +
                "Islamic State threat is alive at Israel's doorstep despite terror group's losses elsewhere\n" +
                "\n" +
                "By Yaakov Lappin/JNS.org\n" +
                "\n" +
                "In Egypt's Sinai Peninsula, despite ongoing efforts by the Egyptian military, an Islamic State-affiliated terror group continues to deliver a succession of painful, deadly attacks on the Arab country's security forces. With Islamic State's losses in Syria and Iraq piling up, the Sinai remains an area where the terrorist organization is active. Occasionally, Islamic State's Sinai affiliate fires rockets into southern Israel, including an attack in mid-October. Yoram Schweitzer, former head of the Counter International Terror Section in the IDF, told JNS.org that Egypt's current security effort in the Sinai \"is better, but we see that terrorism isn't breaking.\"\n" +
                "\n" +
                "Christian Zionist leader Matt Hagee hopes millennials 'will be as pro-Israel as we are'\n" +
                "\n" +
                "By Sean Savage/JNS.org\n" +
                "\n" +
                "Ahead of one of the Christian Zionist community's signature annual events, Cornerstone Church's Executive Pastor Matt Hagee—the son of Christians United for Israel founder Pastor John Hagee—speaks with JNS.org about his father's legacy, the Trump administration and the future of Christian support for Israel.\n" +
                "\n" +
                "Asthma treatment could be Israel's latest high achievement in medical cannabis\n" +
                "\n" +
                "By Adam Abrams/JNS.org\n" +
                "\n" +
                "In a development that could spark Israel's latest achievement within the medical cannabis sector, the Israeli-British cannabis start-up CIITECH announced that it will fund a research project exploring methods for treating asthma with medical cannabis. \"CBD (a non-psychoactive cannabis compound) is proven to have anti-inflammatory properties. Since asthma and other respiratory conditions present themselves as inflammation of the airway, it's long been believed that cannabis might be a good therapeutic candidate,\" said CIITECH founder Clifton Flack.\n" +
                "\n" +
                "There's no good reason for anti-US, anti-Israel UN voting patterns\n" +
                "\n" +
                "By Eric Rozenman/JNS.org\n" +
                "\n" +
                "The Trump administration's decision to withdraw from UNESCO is one shot across the U.N.'s bow. Notoriously hospitable to dictatorships, hostile to Israel and mismanaged as well, UNESCO deserves the warning. But what does the U.S. do about U.N. member countries consistently voting against it and against Israel without even a national policy excuse for doing so? Not enough, writes columnist Eric Rozenman.";
        String listening = archivos.replaceAll(prohibido, ("*".repeat(letrasJ)));
        System.out.println(listening);
    }
}
