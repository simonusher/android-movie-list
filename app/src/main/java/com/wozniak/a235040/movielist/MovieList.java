package com.wozniak.a235040.movielist;

import java.util.ArrayList;

/**
 * Created by Szymon on 22.03.2018.
 */

public class MovieList {
    private static ArrayList<Movie> instance = null;

    public static ArrayList<Movie> getInstance(){
        if(instance == null) {
            instance = new ArrayList<>();
            int[] deadpoolGallery = new int[]{R.drawable.dp_0, R.drawable.dp_1, R.drawable.dp_2, R.drawable.dp_3, R.drawable.dp_4, R.drawable.dp_5, R.drawable.dp_6, R.drawable.dp_7,
                    R.drawable.dp_8, R.drawable.dp_0};

            int[] wvGallery = new int[]{R.drawable.wv0, R.drawable.wv1, R.drawable.wv2, R.drawable.wv3, R.drawable.wv4, R.drawable.wv5, R.drawable.wv6, R.drawable.wv7,
                    R.drawable.wv8, R.drawable.wv1};

            int[] shGallery = new int[]{R.drawable.sh0, R.drawable.sh1, R.drawable.sh2, R.drawable.sh3, R.drawable.sh4, R.drawable.sh5, R.drawable.sh6, R.drawable.sh7,
                    R.drawable.sh8, R.drawable.sh9};

            int[] matrixGallery = new int[]{R.drawable.matrix_0, R.drawable.matrix_1, R.drawable.matrix_2, R.drawable.matrix_3, R.drawable.matrix_4, R.drawable.matrix_5, R.drawable.matrix_6, R.drawable.matrix_7,
                    R.drawable.matrix_8, R.drawable.matrix_9};

            ArrayList<Person> wvActors = new ArrayList<>();
            ArrayList<Person> shActors = new ArrayList<>();
            ArrayList<Person> dpActors = new ArrayList<>();
            ArrayList<Person> matrixActors = new ArrayList<>();

            dpActors.add(Person.createPerson("Ryan", "Reynolds", 42, R.drawable.ryan_reynolds_42));
            dpActors.add(Person.createPerson("Brianna", "Hildebrand", 22, R.drawable.brianna_hildebrand_22));
            dpActors.add(Person.createPerson("Michael", "Benyaer", 48, R.drawable.michael_benyaer_48));
            dpActors.add(Person.createPerson("Ed", "Skrein", 35, R.drawable.ed_skrein_35));
            dpActors.add(Person.createPerson("Stefan", "Kapicic", 40, R.drawable.stefan_kapicic_40));

            matrixActors.add(Person.createPerson("Adam", "Gonczarek", 0, R.drawable.adam_gonczarek));
            matrixActors.add(Person.createPerson("Szymon", "Zaręba", 0, R.drawable.szymon_zareba));
            matrixActors.add(Person.createPerson("Joanna", "Kaczmar-Michalska", 0, R.drawable.joanna_kaczmar_michalska));

            shActors.add(Person.createPerson("Bob", "Ganton", 73, R.drawable.bob_ganton_73));
            shActors.add(Person.createPerson("Clancy", "Brown", 59, R.drawable.clancy_brown_59));
            shActors.add(Person.createPerson("Mark", "Rolston", 62, R.drawable.mark_rolston_62));
            shActors.add(Person.createPerson("Morgan", "Freeman", 81, R.drawable.morgan_freeman_81));
            shActors.add(Person.createPerson("Tim", "Robbins", 60, R.drawable.tim_robbins_60));
            shActors.add(Person.createPerson("William", "Sadler", 68, R.drawable.william_sadler_68));

            wvActors.add(Person.createPerson("Daniel", "Henney", 39, R.drawable.daniel_henney_39));
            wvActors.add(Person.createPerson("Danny", "Huston", 56, R.drawable.danny_huston_56));
            wvActors.add(Person.createPerson("Hugh", "Jackman", 50, R.drawable.hugh_jackman_50));
            wvActors.add(Person.createPerson("Liev", "Schreiber", 51, R.drawable.liev_schreiber_51));
            wvActors.add(Person.createPerson("Lynn", "Collins", 41, R.drawable.lynn_collins_41));
            wvActors.add(Person.createPerson("Ryan", "Reynolds", 42, R.drawable.ryan_reynolds_42));
            wvActors.add(Person.createPerson("Taylor", "Kitsch", 37, R.drawable.taylor_kitsch_37));
            wvActors.add(Person.createPerson("Will.i.am", "", 43, R.drawable.will_i_am_43));


            instance.add(new Movie("Deadpool", "Action", R.drawable.deadpool_poster, R.drawable.deadpool_banner, deadpoolGallery, dpActors));
            instance.add(new Movie("Matrix: Transpozycja", "Action, Sci-Fi", R.drawable.matrix_icon, R.drawable.matrix_jumbo, matrixGallery, matrixActors));
            instance.add(new Movie("The Shawshank Redemption", "Crime, Drama", R.drawable.sh_icon, R.drawable.sh_jumbo, shGallery, shActors));
            instance.add(new Movie("X-Men Origins: Wolverine", "Action", R.drawable.wv_icon, R.drawable.wv_jumbo, wvGallery, wvActors));
            instance.add(new Movie("Deadpool", "Action", R.drawable.deadpool_poster, R.drawable.deadpool_banner, deadpoolGallery, dpActors));
            instance.add(new Movie("Matrix: Transpozycja", "Action, Sci-Fi", R.drawable.matrix_icon, R.drawable.matrix_jumbo, matrixGallery, matrixActors));
            instance.add(new Movie("The Shawshank Redemption", "Crime, Drama", R.drawable.sh_icon, R.drawable.sh_jumbo, shGallery, shActors));
            instance.add(new Movie("X-Men Origins: Wolverine", "Action", R.drawable.wv_icon, R.drawable.wv_jumbo, wvGallery, wvActors));

        }
        return instance;
    }
}
