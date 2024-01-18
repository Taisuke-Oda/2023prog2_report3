import org.checkerframework.checker.units.qual.h;

import jp.ac.uryukyu.ie.e205749.*;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        String enemyName = enemy.getEnemyName();
        boolean enemyDead = enemy.getEnemyDead();
        String heroName = hero.getHeroName();
        boolean heroDead = hero.getHeroDead();

        System.out.printf("%s vs. %s\n", heroName, enemyName);

        int turn = 0;
        while( heroDead == false && enemyDead == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
            // ここで死亡判定を再取得
            heroDead = hero.getHeroDead();
            enemyDead = enemy.getEnemyDead();
        }
        System.out.println("戦闘終了");
    }
}