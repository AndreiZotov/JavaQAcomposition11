import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void testAddThreeFilms() {
        FilmsManager manager = new FilmsManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddFiveFilms() {
        FilmsManager manager = new FilmsManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddSixFilms() {
        FilmsManager manager = new FilmsManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testNotAddFilms() {
        FilmsManager manager = new FilmsManager();


        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddOneFilm() {
        FilmsManager manager = new FilmsManager();
        manager.add("Film I");

        String[] actual = manager.findAll();
        String[] expected = {"Film I"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastThree() {
        FilmsManager manager = new FilmsManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] actual = manager.findLast();
        String[] expected = {"Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOne() {
        FilmsManager manager = new FilmsManager();

        manager.add("Film I");


        String[] actual = manager.findLast();
        String[] expected = {"Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastZero() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFour() {
        FilmsManager manager = new FilmsManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");

        String[] actual = manager.findLast();
        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFive() {
        FilmsManager manager = new FilmsManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");

        String[] actual = manager.findLast();
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastSix() {
        FilmsManager manager = new FilmsManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");

        String[] actual = manager.findLast();
        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastFiveWithLimit() {
        FilmsManager manager = new FilmsManager(6);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");

        String[] actual = manager.findLast();
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastSixWithLimit() {
        FilmsManager manager = new FilmsManager(6);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");

        String[] actual = manager.findLast();
        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastTenWithLimit() {
        FilmsManager manager = new FilmsManager(6);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");
        manager.add("Film X");

        String[] actual = manager.findLast();
        String[] expected = {"Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V"};
        Assertions.assertArrayEquals(expected, actual);
    }


}
