package mate.service;

import mate.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Driver getByLicenceNumber(String licenceNumber);
}
