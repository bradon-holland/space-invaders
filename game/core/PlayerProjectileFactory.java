
package game.core;

public class PlayerProjectileFactory implements ProjectileFactory {
    @Override
    public Projectile createProjectile(double xPos, double yPos, String strategy) {
        return new PlayerProjectile(xPos, yPos);
    }
}
