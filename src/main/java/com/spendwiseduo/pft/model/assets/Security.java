package com.spendwiseduo.pft.model.assets;

import com.spendwiseduo.pft.model.assets.type.SecurityType;

public class Security extends Asset {
    private String isin;
    private SecurityType type;

    public Security(int id, String name, String isin) {
        super(id, name);
        this.isin = isin;
    }
}
