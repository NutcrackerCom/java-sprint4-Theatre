import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private List<Actor> listOfActors;


    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(listOfActors);
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return new ArrayList<>(listOfActors);
    }

    @Override
    public String toString() {
        String str = "Название: " + title + "\nПродолжительность: " + duration + "\nПостановщик: \n" + director + "\n";
        str += "\nСостав актерской труппы:\n";
        for (Actor actor: listOfActors) {
            str += actor.toString();
        }
        return str;
    }

    public boolean addActor (Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер уже добавлен в труппу.");
            return false;
        }
        listOfActors.add(actor);
        System.out.println("Актер добавлен в труппу.");
        return true;
    }

    public boolean changeActor(Actor oldActor, Actor newActor) {
        if (listOfActors.contains(oldActor)) {
            listOfActors.remove(oldActor);
            listOfActors.add(newActor);

            System.out.println("Актер: \n" + oldActor.toString() + "заменен на: \n" + newActor.toString() + "в труппе.");
            return true;
        }
        System.out.println("Актерa " + oldActor.toString() + "нет в труппе");
        return false;
    }

    public boolean changeActor(String name, String surname, Actor newActor) {
        for (Actor actor: listOfActors) {
            if (Objects.equals(actor.getName(), name) && Objects.equals(actor.getSurname(), surname)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                System.out.println("Актер: \n" + surname + "заменен на: \n" + newActor.toString() + "в труппе.");
                return true;
            }
        }
        System.out.println("Актерa " + surname + "нет в труппе");
        return false;
    }

}
