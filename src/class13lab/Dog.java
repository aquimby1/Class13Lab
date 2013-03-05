/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class13lab;

import java.util.Objects;

/**
 *
 * @author aquimby1
 */
public class Dog {
    private String name;
    private String  RabiesId;

    public Dog(String name, String RabiesId) {
        this.name = name;
        this.RabiesId = RabiesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRabiesId() {
        return RabiesId;
    }

    public void setRabiesId(String RabiesId) {
        this.RabiesId = RabiesId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.RabiesId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.RabiesId, other.RabiesId)) {
            return false;
        }
        return true;
    }
    
}
