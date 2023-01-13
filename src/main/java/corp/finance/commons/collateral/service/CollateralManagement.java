package corp.finance.commons.collateral.service;

import corp.finance.commons.collateral.model.Collateral;

import java.util.List;

public interface CollateralManagement {

    List<Collateral> getAllCollateral();

    List<Collateral> getCollateral(List<String> collateralIds);

    Collateral getCollateral(String collateralId);
}
