

# InputGetLogs


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$schema** | **URI** | A URL to the JSON Schema for this object. |  [optional] [readonly] |
|**address** | **String** | The contract address or a list of addresses from which logs should originate |  [optional] |
|**blockHash** | **String** | With the addition of EIP-234, blockHash is a new filter option that restricts the logs returned to the block number referenced in the blockHash. Using the blockHash field is equivalent to setting the fromBlock and toBlock to the block number the blockHash references. If blockHash is present in the filter criteria, neither fromBlock nor toBlock is allowed |  [optional] |
|**fromBlock** | **String** | The block number as a string in decimal format or tags. The supported tag values include earliest for the earliest/genesis block, latest for the latest mined block, pending for the pending state/transactions. |  [optional] |
|**toBlock** | **String** | The block number as a string in decimal format or tags. The supported tag values include earliest for the earliest/genesis block, latest for the latest mined block, pending for the pending state/transactions. |  [optional] |
|**topics** | **List&lt;String&gt;** | An array of DATA topics and also, the topics are order-dependent. Visit this official page to learn more about topics |  [optional] |



