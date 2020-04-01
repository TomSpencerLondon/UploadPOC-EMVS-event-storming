package com.codurance.emvs;

import net.bytebuddy.NamingStrategy;
import org.junit.jupiter.api.Test;

//Manufacturer uploads PMD
//        Manufacturer uploads Batch and Pack data
//        Hub disperses data to relevant NBSs
//        Pharmacist verifies a single pack by scanning barcode
//        Pharmacy system calls NBS api
//        NBS looks up barcode data
//        If it matches, the pack is valid, it returns the pack state
//        If it partially matches or doesn't match, request Hub to validate pack
//        If no match, send an alert to NMVO
//        Once it is valid, pharmacist dispenses the pack and marks the pack as supplied
//        If the pack is a local pack, the NBS updates the pack state
//        If the pack is multi-market, the NBS updates the local state and requests Hub to change the state in other market
//
//ProductPackUploadRequestObject
//        +String productCode
//        +Enum[GS1,PPN] productScheme
//        +UUID batchID
//        +Date expiryDate
//        +List<String> packs
//        +List<String> markets
//        -validate()
// (later - Service + Validators + Repo)
public class Acceptance {
  @Test
  void upload_batch_and_pack() {
    // Given
    // Given JSON dummy object with product pack details
    // is passed to the API
    // Objects include: JSONDummyObject APIObject
    // When
    // Pass JSONDummyObject to upload method of APIObject
    // pseudocode:
    // HubApiObject.upload(JSONHubDummyObject);
    // Verify NBS Repo contains ProductPack with same information


  }
}
