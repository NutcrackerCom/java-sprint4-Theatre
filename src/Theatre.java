import java.util.ArrayList;
import java.util.List;

public class Theatre {
    public static void main(String[] args) {
        Actor actorEdwardNorton = new Actor(Gender.MALE, "Эдвард", "Нортон", 1.83);
        Actor actorBradPitt = new Actor(Gender.MALE, "Бред", "Питт", 1.8);
        Actor actorHelenaBonhamCarter = new Actor(Gender.FEMALE, "Хелена", "Бонем Картер", 1.57);
        Person musicAuthorKingGizmo = new Person(Gender.MALE, "Джон", "Кинг");
        Person choreographerPittBerg = new Person(Gender.MALE, "Пит", "Берг");
        Director directorDavidFincher = new Director(Gender.MALE, "Дэвид", "Финчер", 40);
        Director directorJeffCronenweth = new Director(Gender.MALE, "Джефф", "Кроненвет", 1);


        Show film = new Show("Бойцовский клуб", 131, directorDavidFincher,
                new ArrayList<>());

        Opera opera = new Opera(film, musicAuthorKingGizmo, "Бессонница, драки и мыло.", 3);
        Ballet ballet = new Ballet(film, musicAuthorKingGizmo ,"Лишь утратив всё до конца, мы обретаем свободу", choreographerPittBerg);
        System.out.println(film);

        film.addActor(actorEdwardNorton);
        film.addActor(actorBradPitt);
        film.addActor(actorHelenaBonhamCarter);
        System.out.println("______________________");
        System.out.println(film);
        System.out.println("______________________");
        film.changeActor("Эдвард", "Нортон", new Actor(Gender.MALE, "Саша", "Белыый", 1.8));
        System.out.println(film);
        System.out.println("______________________");
    }
}
