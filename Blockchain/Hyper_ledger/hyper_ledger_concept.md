# Fabric

- Fabric introduces a new architecture for transactions that we call execute-order-validate.

1. execute a transaction and check its correctness, thereby endorsing it.
2. order transactions via a (`pluggable`) consensus protocol
3. validate transactions against an `application-specific endorsement policy` before committing them to the ledger

- **Three main Concept** Fabric CA, Pear and Ordering Service.

# Smart Contract

- `order-execute`

1. validates and orders transactions then propagates them to all peer nodes,
2. each peer then executes the transactions sequentially.

- `Caliper is a blockchain` benchmark framework which allows users to measure the performance of a specific blockchain implementation with a set of predefined use cases. [Caliper](https://wiki.hyperledger.org/projects/caliper)
