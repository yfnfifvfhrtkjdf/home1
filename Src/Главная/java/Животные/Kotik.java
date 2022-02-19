package animals;
public class Kotik {
    private String name; // имя
    private String voce; // голос
    private int satiety; // сытость
    private int weight; // вес
    private static int count; // отвечает за кол-во экземпляров класса
    private static final int[] METHODS = {1, 2, 3, 4, 5};
    // Конструкторы //
    public Kotik(String name, String voce, int satiety, int weight) {
        this.name = name;
        this.voce = voce;
        this.satiety = satiety;
        this.weight = weight;
    }

    public Kotik() {
        name = getName();
        voce = getVoce();
        satiety = getSatiety();
        weight = getWeight();
        count = getCount();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getVoce() {
        return voce;
    }
    public void setVoce(String voce) {
        this.voce = voce;
    }

    public int getSatiety() {
        return satiety;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public static int getCount() {
        return count++;
    }
    public void setCount(int count) {this.count = count++;}

    public int getWeight() {return weight;}
    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int play; // играть
    private int sleep; // спать
    private int wash; // умываться
    private int walk; // гулять
    private int hunt; // охотиться
    private String eda;

    public String getEda () {return  eda;}
    public void setEda () {this.eda=eda;}
    public int getPlay() {return play;}
    public void setPlay(int play) {this.play = play;}
    public int getSleep() {return sleep;}
    public void setSleep(int sleep) {this.sleep = sleep;}
    public int getWash() {return wash;}
    public void setWash(int wash) {this.wash = wash;}
    public int getWalk() {return walk;}
    public void setWalk(int walk) {this.walk = walk;}
    public int getHunt() {return play;}
    public void setHunt(int hunt) {this.hunt = hunt;}

    public boolean play() {
        setPlay(play);
        if (play > 0) {
            play--;
            System.out.println("Котик наигрался. Действие выполнено  " + " уровень игривости: " + play);
            return true;
        } else {
            System.out.println("Котик хочет играть ");
            return  false;
        }
    }
    public boolean sleep() {
        setSleep(sleep);
        if (sleep > 0) {
            sleep--;
            System.out.println("Котик выспался. Действие выполнено. уровень сытости: " + sleep);
            return true;
        } else {
            System.out.println("Котик хочет спать ");
            return false;
        }
    }

    public boolean wash () {
        setWash(wash);
        if (wash > 0) {
            wash--;
            System.out.println("Котик умытый. Действие выполнено  " + " уровень умытости: " + wash);
            return true;
        } else {
            System.out.println("Котик неумытый ");
            return false;
        }
    }

    public boolean walk() {
        setWalk(walk);
        if (walk > 0) {
            walk--;
            System.out.println("Котик нагулялся. Действие выполнено  " + " уровень нагуленности: " + walk);
        return  true;
        } else {
            System.out.println("котик хочет гулять ");
            return false;
        }
    }

    public boolean hunt () {
        setHunt(hunt);
        if (hunt > 0) {
            hunt--;
            System.out.println("Котик наохотился " + " уровень охотничества " + hunt);
        return  true;
        } else {
            System.out.println("Котик хочет охотиться ");
            return  false;
        }

    }
    public boolean eat(int satiety, int s2) {
        this.satiety = satiety;
        satiety += s2;
        System.out.println(satiety);
        return true;
    }

    public boolean eat( int satiety,String eda) {
        this.eda = eda;
        this.satiety = satiety;
        System.out.println(eda +satiety);
        return true;
    }

    public boolean eat() {
        this.eda = eda;
        eat(satiety, eda);
        return  true;
    }

    private String go;
    public String getGo () {return  go;}
    public void setGo () {this.go=go;}

    public void liveAnotherDay() {
        int number;
        int rand = (int) (Math.random() * 5) + 1;
        for (number = 0; number <24; number++){
            switch (rand) {
                case 1:
                    play();
                    number++;
                    System.out.println(number + " - Играл");
                case 2:
                    sleep();
                    number++;
                    System.out.println(number + " - Спал");
                case 3:
                    wash();
                    number++;
                    System.out.println(number + " - Умывался");
                case 4:
                    walk();
                    number++;
                    System.out.println(number + " - Гулял");
                case 5:
                    hunt();
                    number++;
                    System.out.println(number + " - Охотился");
                default:
                    number++;
                    satiety++;
                    System.out.println(number + " - Ел "+ eda + " сытость " + satiety);
break;
            }
        }
    }

}
