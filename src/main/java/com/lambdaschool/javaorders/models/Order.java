package com.lambdaschool.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name="order")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ordnum")
    private long id;

    private double ordamount;

    private double advanceamount;

    @ManyToOne()
    @Column(nullable = false)
    private long custcode;

    @ManyToOne()
    @Column(nullable = false)
    private long agentcode;

    private String orddescription;

    public Order()
    {
    }

    public long getOrdnum()
    {
        return id;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount)
    {
        this.advanceamount = advanceamount;
    }

    public long getCustcode()
    {
        return custcode;
    }

    public void setCustcode(long custcode)
    {
        this.custcode = custcode;
    }

    public long getAgentcode()
    {
        return agentcode;
    }

    public void setAgentcode(long agentcode)
    {
        this.agentcode = agentcode;
    }

    public String getOrddescription()
    {
        return orddescription;
    }

    public void setOrddescription(String orddescription)
    {
        this.orddescription = orddescription;
    }
}
