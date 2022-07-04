/*
Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.

It represents part-of relationship.
In composition, both entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the
other entity.


Aggregation vs Composition
1. Dependency: Aggregation implies a relationship where the child can exist independently of the parent. For example,
Bank and Employee, delete the Bank and the Employee still exist. whereas Composition implies a relationship where the child
cannot exist independent of the parent. Example: Human and heart, heart don&rsquo;t exist separate to a Human

2. Type of Relationship: Aggregation relation is &ldquo;has-a&rdquo; and composition is &ldquo;part-of&rdquo; relation.

3. Type of association: Composition is a strong Association whereas Aggregation is a weak Association.
 */

package Association;

public class Composition {
}
