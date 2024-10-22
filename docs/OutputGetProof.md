

# OutputGetProof


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$schema** | **URI** | A URL to the JSON Schema for this object. |  [optional] [readonly] |
|**accountProof** | **String** | An array of rlp-serialized MerkleTree-Nodes which starts with the stateRoot-Node and follows the path of the SHA3 address as key |  |
|**address** | **String** | The address associated with the account |  |
|**balance** | **String** | The current balance of the account in wei |  |
|**codeHash** | **String** | A 32 byte hash of the code of the account |  |
|**nonce** | **String** | The hash of the generated proof-of-work. Null if pending |  |
|**storageHash** | **String** | A 32 byte SHA3 of the storageRoot. All storage will deliver a MerkleProof starting with this rootHash |  |
|**storageProof** | [**List&lt;ResponseStorageEntry&gt;**](ResponseStorageEntry.md) | An array of storage-entries as requested. Each entry is an object with the following fields: |  |



