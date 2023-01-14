package corp.finance.commons.collateral.service;


import corp.finance.commons.collateral.model.Collateral;

import java.util.List;

public interface CollateralService {

    List<Collateral> getAllCollaterals();

    List<Collateral> getCollaterals(List<String> collateralIds);

    Collateral getCollateral(String collateralId);
}
