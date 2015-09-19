package ac.za.cput.companymanager.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Container implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int containerSize;

    public Container(){}

    public int getContainerSize()
    {
        return containerSize;
    }

    public Container(Builder build)
    {
        containerSize = build.containerSize;
    }

    public static  class Builder
    {
        private int containerSize;

        public Builder(int containerSize)
        {
            this.containerSize = containerSize;
        }


        public Builder copy(Container value)
        {
            this.containerSize = value.containerSize;
            return this;
        }

        public Container build()
        {
            return new Container(this);
        }

    }


}
