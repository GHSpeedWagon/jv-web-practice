package mate.service;

import mate.model.Manufacturer;

public interface ManufacturerService extends GenericService<Manufacturer> {
    Manufacturer getByManufacturerName(String manufacturerName);
}
