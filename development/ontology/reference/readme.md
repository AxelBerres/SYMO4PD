#The Reference Ontology
The SYMO4PD project aims at developing an innovative system of collaborative system design editors which which employ a common ontology Thei Reference Ontology provides semantic references for objects and relations in these design models. Thereby, the SYMOP4PD system facilitates the exchange of model objects and relations according to their meaning.
If a group of system designers uses the Reference Ontology it must contain at least all concepts which are relevant for more than one designer of that group. Accordingly, the scope of the system models and the Reference Ontology are similar.
##Differences between the Reference Ontology and Design Models
Whereas design models are used to prescribe a new or evolved product before it becomes reality by implementaion or manufacturing, the Reference Ontology describes system components and their relations and characteristics but do not contain the topology and states of the designed product.

|Reference Ontology|Design Model|
|------------------|------------|
|Descriptive|Prescriptive|
|Open World Assumption|Closed World Assumption|

Designers use the Reference Ontology to express that objects and relations represent the same thing or different thing. As ontology languages usually express semantics by logical relations between entities, a concept referenced by a model object has a context. This context can be used by the SYMO4PD system to recommend reference concepts for adjacent model objects or to recommend a suitable container for an imported object from another model.

##Examples
* If a container object "e" from a design model references the ontology concept SystemComponent:Engine than the container object "w" which is connected to "e" is most probably the ontology concept SystemComponent:Wing.
* Designer A imports object "cd1" referncing SystemComponent:CompressorDisk the Model of Designer B. The SYMO4PD system looks for suitable container objects in the model of Designer A. Designer B used the conteiner object "ca1" referencing SystemComponent:CompressorAssempbly which is not references in the Model of Designer A. However, the model of Designer A contains a container object "ea" referencing SystemComponent:TurboEngineAssembly, which according to the Reference Ontology is a suitable container for SystemComponent:CompressorDisk which has an indirect part-of relation to it.
