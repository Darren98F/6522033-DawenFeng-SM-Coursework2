package com.almasb.fxglgames.spaceinvaders.level;
import com.almasb.fxgl.entity.GameEntity;
import com.almasb.fxglgames.spaceinvaders.Config;
import static com.almasb.fxglgames.spaceinvaders.Config.ENEMIES_PER_ROW;
import static com.almasb.fxglgames.spaceinvaders.Config.ENEMY_ROWS;

/**
 * @author Almas Baimagambetov  
 */
public class Level3 extends SpaceLevel {

    @Override
    public void init() {
    	for (int x = 0; x < ENEMIES_PER_ROW * ENEMY_ROWS; x++) {
          //Config.WIDTH=650, 16enemy, 650/16 = 40
          GameEntity enemy = spawnEnemy(x*40,Config.HEIGHT * 2 / 3);
          // Enemies shall be stationary (don’t move)
         } 
    }
    
    @Override
    public void destroy() {

    }
}