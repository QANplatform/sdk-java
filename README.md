# QAN Java SDK

This repository is guaranteed up-to-date with the upstream QAN API definitions, and leverages OpenAPI technology to stay consistent.

Versioning is based on SEMVER, meaning:

- Stable releases guarantee backwards compatibility for the same major versions.
- Minor releases will not contain breaking changes.
- Patch releases only focus on fixing issues.

## Documentation for API Endpoints

All URIs are relative to *https://rpc-testnet.qanplatform.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qanBlockNumber**](docs/QanApi.md#qanBlockNumber) | **GET** /blockNumber/ | Returns the latest block number of the blockchain. |
| [**qanCall**](docs/QanApi.md#qanCall) | **POST** /call/ | Executes a new message call immediately without creating a transaction on the block chain. |
| [**qanChainId**](docs/.md#qanChainId) | **GET** /chainId/ | Returns the current network/chain ID, used to sign replay-protected transaction introduced in EIP-155. |
| [**qanEstimateGas**](docs/QanApi.md#qanEstimateGas) | **POST** /estimateGas/ | Returns an estimation of gas for a given transaction. |
| [**qanFeeHistory**](docs/QanApi.md#qanFeeHistory) | **POST** /feeHistory/ | Returns the collection of historical gas information. |
| [**qanGasPrice**](docs/QanApi.md#qanGasPrice) | **GET** /gasPrice/ | Returns the current gas price on the network in wei. |
| [**qanGetBalance**](docs/QanApi.md#qanGetBalance) | **GET** /getBalance/{Address}/ | Returns the balance of the account of given address. |
| [**qanGetBlockByHash**](docs/QanApi.md#qanGetBlockByHash) | **GET** /getBlockByHash/{Hash}/{TransactionDetailFlag}/ | Returns information of the block matching the given block hash. |
| [**qanGetBlockByNumber**](docs/QanApi.md#qanGetBlockByNumber) | **GET** /getBlockByNumber/{BlockNumber}/{TransactionDetailFlag}/ | Returns information of the block matching the given block number. |
| [**qanGetBlockReceipts**](docs/QanApi.md#qanGetBlockReceipts) | **GET** /getBlockReceipts/{BlockNumber}/ | Returns all transaction receipts for a given block. |
| [**qanGetBlockTransactionCountByHash**](docs/QanApi.md#qanGetBlockTransactionCountByHash) | **GET** /getBlockTransactionCountByHash/{Hash}/ | Returns the number of transactions for the block matching the given block hash. |
| [**qanGetBlockTransactionCountByNumber**](docs/QanApi.md#qanGetBlockTransactionCountByNumber) | **GET** /getBlockTransactionCountByNumber/{BlockNumber}/ | Returns the number of transactions for the block matching the given block number. |
| [**qanGetCode**](docs/QanApi.md#qanGetCode) | **GET** /getCode/{Address}/ | Returns the compiled bytecode of a smart contract. |
| [**qanGetFilterChanges**](docs/QanApi.md#qanGetFilterChanges) | **GET** /getFilterChanges/{FilterId}/ | Polling method for a filter, which returns an array of events that have occurred since the last poll. |
| [**qanGetFilterLogs**](docs/QanApi.md#qanGetFilterLogs) | **GET** /getFilterLogs/{Id}/ | Returns an array of all logs matching filter with given id. |
| [**qanGetLogs**](docs/QanApi.md#qanGetLogs) | **POST** /getLogs/ | Returns an array of all logs matching a given filter object. |
| [**qanGetProof**](docs/QanApi.md#qanGetProof) | **POST** /getProof/ | Returns the account and storage values of the specified account including the Merkle-proof. |
| [**qanGetStorageAt**](docs/QanApi.md#qanGetStorageAt) | **POST** /getStorageAt/ | Returns the value from a storage position at a given address. |
| [**qanGetTransactionByBlockHashAndIndex**](docs/QanApi.md#qanGetTransactionByBlockHashAndIndex) | **GET** /getTransactionByBlockHashAndIndex/{blockHash}/{index}/ | Returns information about a transaction given a blockhash and transaction index position. |
| [**qanGetTransactionByBlockNumberAndIndex**](docs/QanApi.md#qanGetTransactionByBlockNumberAndIndex) | **GET** /getTransactionByBlockNumberAndIndex/{blockNumber}/{index}/ | Returns information about a transaction given a block number and transaction index position. |
| [**qanGetTransactionByHash**](docs/QanApi.md#qanGetTransactionByHash) | **GET** /getTransactionByHash/{hash}/ | Returns the information about a transaction from a transaction hash. |
| [**qanGetTransactionCount**](docs/QanApi.md#qanGetTransactionCount) | **GET** /getTransactionCount/{Address}/{BlockNumber}/ | Returns the number of transactions sent from an address. |
| [**qanGetTransactionReceipt**](docs/QanApi.md#qanGetTransactionReceipt) | **GET** /getTransactionReceipt/{Hash}/ | Returns the receipt of a transaction by transaction hash. |
| [**qanMaxPriorityFeePerGas**](docs/QanApi.md#qanMaxPriorityFeePerGas) | **GET** /maxPriorityFeePerGas/ | Get the priority fee needed to be included in a block. |
| [**qanNewBlockFilter**](docs/QanApi.md#qanNewBlockFilter) | **GET** /newBlockFilter/ | Creates a filter in the node, to notify when a new block arrives. |
| [**qanNewFilter**](docs/QanApi.md#qanNewFilter) | **POST** /newFilter/ | Creates a filter object, based on filter options, to notify when the state changes (logs). |
| [**qanNewPendingTransactionFilter**](docs/QanApi.md#qanNewPendingTransactionFilter) | **GET** /newPendingTransactionFilter/ | Creates a filter in the node to notify when new pending transactions arrive. |
| [**qanSendRawTransaction**](docs/QanApi.md#qanSendRawTransaction) | **POST** /sendRawTransaction/ | Creates new message call transaction or a contract creation for signed transactions. |
| [**qanSyncing**](docs/QanApi.md#qanSyncing) | **GET** /syncing/ | Returns an object with the sync status of the node if the node is out-of-sync and is syncing. Returns null when the node is already in sync. |
| [**qanUninstallFilter**](docs/QanApi.md#qanUninstallFilter) | **GET** /uninstallFilter/{FilterId}/ | Uninstalls a filter with the given filter id. |
| [**qanXlinkValid**](docs/QanApi.md#qanXlinkValid) | **GET** /xlinkValid/{Address}/ | Returns the xlink validity time of the account of given address. |


## Documentation For Models

 - [ErrorDetail](docs/ErrorDetail.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [EstimateGasObject](docs/EstimateGasObject.md)
 - [FilterObject](docs/FilterObject.md)
 - [InputCall](docs/InputCall.md)
 - [InputEstimateGas](docs/InputEstimateGas.md)
 - [InputFeeHistory](docs/InputFeeHistory.md)
 - [InputGetLogs](docs/InputGetLogs.md)
 - [InputGetProof](docs/InputGetProof.md)
 - [InputGetStorageAt](docs/InputGetStorageAt.md)
 - [InputNewFilter](docs/InputNewFilter.md)
 - [InputSendRawTransaction](docs/InputSendRawTransaction.md)
 - [InputSubscribe](docs/InputSubscribe.md)
 - [OutputAccounts](docs/OutputAccounts.md)
 - [OutputBlobBaseFee](docs/OutputBlobBaseFee.md)
 - [OutputBlockNumber](docs/OutputBlockNumber.md)
 - [OutputCall](docs/OutputCall.md)
 - [OutputChainId](docs/OutputChainId.md)
 - [OutputEstimateGas](docs/OutputEstimateGas.md)
 - [OutputFeeHistory](docs/OutputFeeHistory.md)
 - [OutputGasPrice](docs/OutputGasPrice.md)
 - [OutputGetAccount](docs/OutputGetAccount.md)
 - [OutputGetBalance](docs/OutputGetBalance.md)
 - [OutputGetBlockByHash](docs/OutputGetBlockByHash.md)
 - [OutputGetBlockByNumber](docs/OutputGetBlockByNumber.md)
 - [OutputGetBlockReceipts](docs/OutputGetBlockReceipts.md)
 - [OutputGetBlockTransactionCountByHash](docs/OutputGetBlockTransactionCountByHash.md)
 - [OutputGetBlockTransactionCountByNumber](docs/OutputGetBlockTransactionCountByNumber.md)
 - [OutputGetCode](docs/OutputGetCode.md)
 - [OutputGetFilterChanges](docs/OutputGetFilterChanges.md)
 - [OutputGetFilterLogs](docs/OutputGetFilterLogs.md)
 - [OutputGetLogs](docs/OutputGetLogs.md)
 - [OutputGetProof](docs/OutputGetProof.md)
 - [OutputGetStorageAt](docs/OutputGetStorageAt.md)
 - [OutputGetTransactionByBlockHashAndIndex](docs/OutputGetTransactionByBlockHashAndIndex.md)
 - [OutputGetTransactionByBlockNumberAndIndex](docs/OutputGetTransactionByBlockNumberAndIndex.md)
 - [OutputGetTransactionByHash](docs/OutputGetTransactionByHash.md)
 - [OutputGetTransactionCount](docs/OutputGetTransactionCount.md)
 - [OutputGetTransactionReceipt](docs/OutputGetTransactionReceipt.md)
 - [OutputGetUncleCountByBlockHash](docs/OutputGetUncleCountByBlockHash.md)
 - [OutputGetUncleCountByBlockNumber](docs/OutputGetUncleCountByBlockNumber.md)
 - [OutputMaxPriorityFeePerGas](docs/OutputMaxPriorityFeePerGas.md)
 - [OutputNewBlockFilter](docs/OutputNewBlockFilter.md)
 - [OutputNewFilter](docs/OutputNewFilter.md)
 - [OutputNewPendingTransactionFilter](docs/OutputNewPendingTransactionFilter.md)
 - [OutputSendRawTransaction](docs/OutputSendRawTransaction.md)
 - [OutputSubscribe](docs/OutputSubscribe.md)
 - [OutputSyncing](docs/OutputSyncing.md)
 - [OutputUninstallFilter](docs/OutputUninstallFilter.md)
 - [OutputUnsubscribe](docs/OutputUnsubscribe.md)
 - [ParamsTransaction](docs/ParamsTransaction.md)
 - [QanXlinkValidResponse](docs/QanXlinkValidResponse.md)
 - [ResponseBlock](docs/ResponseBlock.md)
 - [ResponseLog](docs/ResponseLog.md)
 - [ResponseStorageEntry](docs/ResponseStorageEntry.md)
 - [ResponseTransaction](docs/ResponseTransaction.md)
 - [ResponseTransactionReceipt](docs/ResponseTransactionReceipt.md)
 - [ResponseWithdrawals](docs/ResponseWithdrawals.md)
 - [SyncStatus](docs/SyncStatus.md)

## Acknowledgements

We would like to thank Smartbear and OpenAPITools tech for making building declarative APIs possible.
A huge benefit for the whole industry!
