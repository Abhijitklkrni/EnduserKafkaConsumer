Kafa Overview


- A Kafka cluster has multiples topics segregated logically depending on the use case.
- A topic can have multiple partitions - partitioned by some key, each partition can exists separately in different servers.
-  Producer produces in to Kafka topics, depending on partition key it is stored in the particular partition, if there is single partition data is stored in that partition
   Messages can be consumed by consumers from Consumer group
- If in case of a single partition, consumer when created is assigned to a consumer group, and that consumer can read messages from that topic/partition. If there are multiple consumers in that consumer group, other consumers will be idle as Kafka allows only one consumer from a consumer group to read from a partition. consumers from other consumer groups will be allowed to read from the same topic/partition
- In case of multiple partitions(3), 3 consumers at max from a consumer group will be allowed to read from the topic, where each consumer will be assigned 1 partition, if there are more consumers than no of partition , extra consumers will sit idle.
- If there are more partitions  than no. of consumers, the consumers will read from multiple partitions. Ex: 4 partitions and 2 consumers, each consumer will read from 2 partitions.