package de.ehex.foss.gematik.specifications.gemSpec_OM;

import org.j8unit.repository.java.lang.EnumTests;
import de.ehex.foss.gematik.specifications.AFOTests;
import de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs;

public abstract interface AFOsTests<SUT extends AFOs> extends EnumTests<SUT, AFOs>, AFOTests<SUT> {
}
